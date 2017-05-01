package Example3;

class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void SaveDocument() {
        System.out.println("EXP Document has been saved in new format");
    }
}
