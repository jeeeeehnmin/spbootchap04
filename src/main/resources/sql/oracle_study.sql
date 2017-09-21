select * from tbl_dept;
select * from tbl_emp;

select * from dept;
select * from emp;

insert into TBL_DEPT
(dname, deptno, loc)
select dname, deptno, loc from dept; 

insert into tbl_emp
(comm, deptno, empno, ename, gender, hiredate, job, mgr, sal)
select comm, deptno, empno, ename, gender, hiredate, job, mgr, sal from emp;

insert into tbl_dept
select * from dept;