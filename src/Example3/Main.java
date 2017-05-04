package Example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter password: ");
        Scanner scan = new Scanner(System.in);
        String keyWord = scan.next();
        if (keyWord.equals("pro") || keyWord.equals("Pro") || keyWord.equals("PRO")) {
            DocumentWorker profile = new ProDocumentWorker();
            profile.OpenDocument();
            profile.EditDocument();
            profile.SaveDocument();
        } else if (keyWord.equals("exp") || keyWord.equals("Exp") || keyWord.equals("EXP")) {
            DocumentWorker profile = new ExpertDocumentWorker();
            profile.OpenDocument();
            profile.EditDocument();
            profile.SaveDocument();//test commet for checking of COMMIT AND PUSH option
        } else {
            DocumentWorker profile = new DocumentWorker();
            profile.OpenDocument();
            profile.EditDocument();
            profile.SaveDocument();
        }

    }
}