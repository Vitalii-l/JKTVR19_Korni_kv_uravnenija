/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korni_kv_uravnenija;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
class App {
    public void run() {
        System.out.println("=============== Корни квадратного уравнения =================");
        System.out.println("Формула квадратного уравнения: A*x2 +B*x + C=0");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        
        double koA = 0, koB = 0, koC = 0;
        
        System.out.print("Введите Коэффициент А: ");

        // Проверка типа данных введенного значения A, если не числовое, то ошибка
        try {
            koA = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Неправильный ввод. Вероятно, вы ввели не числовое значение.");
            System.exit(0);
            
        }
        
        
        System.out.print("Введите Коэффициент B: ");
        koB = scanner.nextDouble();
        System.out.print("Введите Коэффициент C: ");
        koC = scanner.nextDouble();
        
        double dis = koB*koB - 4 * koA * koC;
        double x1 = (-koB + Math.sqrt(dis))/(2*koA);
        double x2 = (-koB - Math.sqrt(dis))/(2*koA);
        double disKoren = Math.sqrt(dis);
        
        
        System.out.println("Diskriminant");
        System.out.println(dis);
        System.out.println("============================================");
        
        System.out.printf("Корень X1: ", x1);
        System.out.println();
        System.out.printf("Корень X2: ", x2);
        System.out.println();
        
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите максимальное число: ");
        //int max = scanner.nextInt();

    }
    
}
