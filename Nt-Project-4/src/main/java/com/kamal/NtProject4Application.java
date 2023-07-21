package com.kamal;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kamal.controller.MainController;
import com.kamal.vo.EmployeeVO;

@SpringBootApplication
public class NtProject4Application {

	public static void main(String[] args) {
		//read input from end user
		Scanner sc=new Scanner(System.in);
		System.out.println("desg count:: ");
		int count= sc.nextInt();
		String desgs[]=null;
		if(count>=1)
			desgs=new String[count];
		else {
			System.out.println("invalide desg count");
			return;
		}
		for(int i=0;i<count;++i) {
			System.out.println("enter desg "+(i+1));
		}
		
	ApplicationContext ctx=	SpringApplication.run(NtProject4Application.class, args);
	 MainController controller=ctx.getBean("controller",MainController.class);
	 try {
		 List<EmployeeVO> listVO=controller.displayEmpsByDesg(desgs);
		 listVO.forEach(vo->{
			 System.out.println(vo);
		 });
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}

}

