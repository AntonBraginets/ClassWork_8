package Example1;

class BadPupil extends Pupil {
    @Override
    void Study() {
        System.out.println("Has bad marks");
    }
    @Override
    void Read() {
        System.out.println("Reads badly");
    }
    @Override
    void Write() {
        System.out.println("Writes badly");
    }
    @Override
    void Relax() {
        System.out.println("Relaxes as looser");
    }
}