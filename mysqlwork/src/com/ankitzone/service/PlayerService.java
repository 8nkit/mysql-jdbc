package com.ankitzone.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ankitzone.dto.Employee;

public class PlayerService {
Connection con;
Statement st;
ResultSet rs;

public PlayerService() {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ankitdb", "root", "1729");
st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
rs = st.executeQuery("select * from emp1");
} catch (Exception e) {
e.printStackTrace();
}
}

public Employee getEmployee(String label) {
Employee emp = null;
boolean state = true;
try {
if(label.equals("First")) {
state = rs.first();
}
if(label.equals("Next")) {
state = rs.next();
}
if(label.equals("Previous")) {
state = rs.previous();
}
if(label.equals("Last")) {
state = rs.last();
}

if(state == true) {
emp = new Employee();
emp.setEno(rs.getInt("ENO"));
emp.setEname(rs.getString("ENAME"));
emp.setEsal(rs.getFloat("ESAL"));
emp.setEaddr(rs.getString("EADDR"));
}else {
emp = null;
}

} catch (Exception e) {
e.printStackTrace();
}
return emp;
}
}