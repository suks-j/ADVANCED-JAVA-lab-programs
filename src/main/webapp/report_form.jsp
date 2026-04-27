<form action="reportCriteria" method="post">

Select Report:
<select name="type">
<option value="name">Name Starts With</option>
<option value="years">Years of Service</option>
<option value="salary">Salary Greater Than</option>
</select><br>

Value: <input type="text" name="value" required><br>

<input type="submit" value="Generate Report">
</form>