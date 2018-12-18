# HibernateDemo1

Hibernate having three types of objects or scopes
Transient
Persistence object
Detached object

Creating plain object , it won’t have any hibernate configuration then the object is called Transient state object.
If we attach any plain object to hibernate is called persistence object or scope
If we remove any object from Persistence or hibernate then we called as detached scope.

In the mapping file we can use id or composite-id for declaring primary key. composite-id used for composite primary keys.
For remaining columns use “property” tag.

For establish Hibernate we need pojo class, mapping file, configuration file, test class

Example file of mapping:
<hibernate-mapping>
<class name=”beans.Student” table=”Student007” schema=”student_schema”>
<id name=”id” column=”sid”/>
<property name=”name” column=”sname”/>
<property name=”lname” column=”lname”/>
</class>
</hibernate-mapping>

Configuration file example hibernate.cfb.xml:
<!-- Database properties and connection pool properties , Hibernate commands, mapping files-->
<hibernate-configuration>
<session-factory>
>!--DB Configurations -->
<property name=”connection.driver_class”></property>
<property name=”connection.url”></property>
<property name=”connection.username”></property>
<property name=”connection.password”></property>
<property name=”connection.pool-size”></property>

<property name=”dialect”>org.hibernate.dialect.oracleDialect</property>
<mapping resource=”student.hbm.xml”></mapping>
</session-factory>
</hibernate-configuration>

Configuration class is a container for hibernate.
session.save(object) is transient state.
transaction.commit() is persistent state
Garbage collector performs only cleaning operation at the transient state only, once if the object is moved to persistent state it is stored in temporary storage area, it cannot garbage collect. To move the object from persistent to transient state again just do session.evict(object). 

Based on dialect hibernate create queries.



