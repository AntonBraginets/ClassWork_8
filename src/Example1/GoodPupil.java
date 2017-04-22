package Example1;

class GoodPupil extends Pupil {
    @Override
    void Study() {
        System.out.println("Has good marks");
    }

    @Override
    void Read() {
        System.out.println("Reads good");
    }

    @Override
    void Write() {
        System.out.println("Writes good");
    }

    @Override
    void Relax() {
        System.out.println("Relaxes as usual person");
    }
}
