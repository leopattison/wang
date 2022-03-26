package com;


import com.entity.Equation;

public class randomTopic {

    //随机生成20道加减乘除算式
        public Equation[] randomTopic() {

            int n = 20;
            int a=0,b =0, c = 0;
            int sum = 0;
            int[] op1 = new int[n];
            int[] op2 = new int[n];
            String[] result = new String[n];//存放答案
            String[] questions = new String[n];
            Equation[] eq = new Equation[n];
            for (int i = 0; i < n; i++) {
                op1[i] = (int) (Math.random() * 3); // 第一个运算符
                op2[i] = (int) (Math.random() * 3); // 第二个运算符
                a = (int) (Math.random() * 100) ; // 数a
                b = (int) (Math.random() * 100) ; // 数b
                c = (int) (Math.random() * 100) ;//数C
                result[i] = jisuan(a , op1[i] , b , op2[i] , c); // 正确答案
                questions[i] = a + getOp(op1[i]) + b + getOp(op2[i]) + c +"=" + result[i];
                eq [i]= new Equation(a + getOp(op1[i]) + b + getOp(op2[i]) + c,result[i]);
            }

            return eq;
        }

        // 获取运算符
        private static String getOp(int index) {
            String string = "";
            switch (index) {
                case 0:
                    string = "+";
                    break;
                case 1:
                    string = "-";
                    break;
                case 2:
                    string = "*";
                    break;
                case 3:
                    string = "/";
                    break;
            }
            return string;
        }

        // 计算答案
        private  String jisuan(int a, int op1 , int b, int op2 ,int c) {
            int sum = 0;
            switch (op1) {
                case 0:
                    switch (op2){
                        case 0:
                            sum = a + b + c ;
                            break;
                        case 1:
                            sum = a + b - c ;
                            break;
                        case 2:
                            sum = a + b * c ;
                            break;
                        case 3:
                            sum = a + b / c ;
                            break;
                    }
                    break;
                case 1:
                    switch (op2){
                        case 0:
                            sum = a - b + c ;
                            break;
                        case 1:
                            sum = a - b - c ;
                            break;
                        case 2:
                            sum = a - b * c ;
                            break;
                        case 3:
                            sum = a - b / c ;
                            break;
                    }
                    break;
                case 2:
                    switch (op2){
                        case 0:
                            sum = a*b+c ;
                            break;
                        case 1:
                            sum = a*b-c ;
                            break;
                        case 2:
                            sum = a*b*c ;
                            break;
                        case 3:
                            sum = a*b/c ;
                            break;
                    }
                    break;
                case 3:
                    switch (op2){
                        case 0:
                            sum = a / b + c ;
                            break;
                        case 1:
                            sum = a / b - c ;
                            break;
                        case 2:
                            sum = a / b * c ;
                            break;
                        case 3:
                            sum = a / b / c ;
                            break;
                    }
                    break;
            }

            return String.valueOf(sum);
        }
    }


