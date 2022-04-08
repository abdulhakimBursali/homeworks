import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String userName, password, questions, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.println("Şifreniz: ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız. ");
        }else {
            System.out.println("Şifreniz yanlış. Şifrenizi sıfırlamak istermisiniz? 'evet' veya 'hayır'");
            questions = inp.nextLine();
            if(questions.equals("evet")){
                System.out.println("Yeni şifreniz ");
                newPassword = inp.nextLine();
                if(!newPassword.equals("java123")){
                    System.out.println("Şifre oluşturuldu. ");
                }else {
                    System.out.println("Şifre oluşturulamadı. ");
                }
            }
        }
    }
}
