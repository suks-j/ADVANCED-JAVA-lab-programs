<html>
<head>
    <title>Student Result Form</title>

    <script>
        function validateForm() {
            let fields = ["rollno","name","s1","s2","s3","s4","s5"];

            for (let i = 0; i < fields.length; i++) {
                let val = document.forms["form"][fields[i]].value;
                if (val == "") {
                    alert("All fields must be filled!");
                    return false;
                }
            }

            for (let i = 1; i <= 5; i++) {
                let mark = document.forms["form"]["s"+i].value;
                if (mark < 0 || mark > 100) {
                    alert("Marks must be between 0 and 100!");
                    return false;
                }
            }

            return true;
        }
    </script>
</head>

<body>
    <h2>Student Marks Form</h2>

    <form name="form" action="ResultServlet" method="post" onsubmit="return validateForm()">
        Roll No: <input type="text" name="rollno"><br><br>
        Name: <input type="text" name="name"><br><br>

        Subject 1: <input type="text" name="s1"><br>
        Subject 2: <input type="text" name="s2"><br>
        Subject 3: <input type="text" name="s3"><br>
        Subject 4: <input type="text" name="s4"><br>
        Subject 5: <input type="text" name="s5"><br><br>

        <input type="submit" value="Calculate Result">
    </form>
</body>
</html>