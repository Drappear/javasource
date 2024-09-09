package emp2;

public class EmpService {
    private EmpDAO empDAO;

    public EmpService(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    public boolean addEmp(EmpDTO dto) {
        return empDAO.insert(dto);
    }
}
