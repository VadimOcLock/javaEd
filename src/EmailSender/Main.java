package EmailSender;

import EmailSender.Mail;
import EmailSender.UserProfile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String textTemplate = "Здраввствуйте, %s, вы попали под рассылку!";

        UserProfile userProfile1 = new UserProfile("Vadim", "vadimoclock@gmail.com");
        UserProfile userProfile2 = new UserProfile("Olga", "v.kozenkov@foxford.ru");

        ArrayList<UserProfile> userProfiles = new ArrayList<>();
        userProfiles.add(userProfile1);
        userProfiles.add(userProfile2);

        List<Mail> emailList = new ArrayList<>();

        for (UserProfile userProfile : userProfiles) {
            Mail mail = new Mail(userProfile.getEmail(), String.format(textTemplate, userProfile.getName()));
            emailList.add(mail);
        }

        Iterator<Mail> mailIterator = emailList.iterator();
        while (mailIterator.hasNext()) {
            Mail mail = mailIterator.next();
            if (mail.getEmail().equals(userProfile1.getEmail()))
                mailIterator.remove();
        }

        System.out.println(emailList.size());

        for (Mail mail : emailList) {
            System.out.println(mail.toString());
        }

        System.out.println("------------------------------------------");

        emailList.forEach(mail -> System.out.println(mail.toString()));
    }
}
