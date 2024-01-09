## Приложение для работы с сотрудниками

Простое WEB приложение на базе фреймворка Spring

### Стек:
- Spring MVC;
- MySQL;
- Hibernate ORM;
- Hibernate Validator;

### SQL запрос для создания базовой таблицы
```sql
create table spring_employees.employees(
      id int auto_increment not null,
      name varchar(45),
      surname varchar(45),
      salary int,
      department varchar(45),
      age int,
      primary key(id)
);
```