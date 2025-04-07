<!DOCTYPE html>
<html>
<head>
<title>Complete Donation</title>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
</head>
<body>
<form>
<button id="rzp-button1">Pay Now</button>
</form>
<script>
var options = {
"key": "<%= RAZORPAY_KEY_ID %>", // Enter the Key ID generated from the Dashboard
"amount": "<%= request.getAttribute('amount') %>",
"currency": "INR",
"name": "Charity Organization",
"description": "Thank you for your donation!",
"image": "/images/charity_logo.png",
"order_id": "<%= request.getAttribute('order_id') %>",
"handler": function (response){
alert("Payment successful!");
window.location.href = "thankyou.jsp";
}
};
var rzp1 = new Razorpay(options);
document.getElementById('rzp-button1').onclick = function(e){
rzp1.open();
e.preventDefault();
}
</script>
</body>
</html>