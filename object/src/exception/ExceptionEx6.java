package exception;

public class ExceptionEx6 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFile();
        } catch (SpaceException e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보 후 재설치 바랍니다.");
        } catch (MemoryException e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("재설치 바랍니다.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFile() {

    }

    static void deleteTempFiles() {

    }

    static boolean enoughMemory() {
        return true;
    }

    static boolean enoughSpace() {
        return false;
    }
}
