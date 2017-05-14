package Example3;

class ProDocumentWorker extends DocumentWorker {
    @Override
    public void EditDocument() {
        System.out.println("PRO Document has been edited");
    }

    @Override
    public void SaveDocument() {
        System.out.println("PRO Document has been saved in old format. Saving in new format is available in EXPERT mode");
    }
}