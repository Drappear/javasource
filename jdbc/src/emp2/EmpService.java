package emp2;

import java.util.List;

public class EmpService {
    private EmpDAO empDAO;

    public EmpService(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    public boolean addEmp(EmpDTO dto) {
        return empDAO.insert(dto);
    }

    public EmpDTO getRow(int empNo) {
        return empDAO.getEmp(empNo);
    }

    public List<EmpDTO> getList() {
        return empDAO.getList();
    }

    public boolean updateEmpInfo(EmpDTO dto) {
        return empDAO.empUpdate(dto);
    }

    public boolean deleteEmpInfo(int empNo) {
        return empDAO.empDelete(empNo);
    }
}
