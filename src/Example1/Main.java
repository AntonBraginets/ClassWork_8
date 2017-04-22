package Example1;

public class Main {
    public static void main(String[] args) {
        BadPupil pupil1 = new BadPupil();
        BadPupil pupil2 = new BadPupil();
        ExcellentPupil pupil3 = new ExcellentPupil();
        GoodPupil pupil4 = new GoodPupil();

        ClassRoom class1 = new ClassRoom(pupil1, pupil2, pupil3, pupil4);
        System.out.println("Ivanov:");
        class1.getPupil1().Study();
        class1.getPupil1().Read();
        class1.getPupil1().Write();
        class1.getPupil1().Relax();
        System.out.println();
        System.out.println("Petrov:");
        class1.getPupil2().Study();
        class1.getPupil2().Read();
        class1.getPupil2().Write();
        class1.getPupil2().Relax();
        System.out.println();
        System.out.println("Sidorov:");
        class1.getPupil3().Study();
        class1.getPupil3().Read();
        class1.getPupil3().Write();
        class1.getPupil3().Relax();
        System.out.println();
        System.out.println("Popov:");
        class1.getPupil4().Study();
        class1.getPupil4().Read();
        class1.getPupil4().Write();
        class1.getPupil4().Relax();
    }
}
