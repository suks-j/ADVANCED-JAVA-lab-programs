<html>
<body>
    <h2>Add Cookie</h2>
    <form action="addCookie.jsp" method="post">
        Name:
        <input type="text" name="cname" required><br><br>

        Domain:
        <input type="text" name="cdomain" required><br><br>

        Max Expiry Age (in sec):
        <input type="text" name="cage" required><br><br>

        <input type="submit" value="Add Cookie">
    </form>
</body>
</html>