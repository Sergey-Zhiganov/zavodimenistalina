import java.util.ArrayList;
import java.util.List;

record Product(String name) {
}

record EmployeePosition(String position) {
}

record Equipment(String name, int quantity) {
}

record Material(String name) {
}

record Service(String name) {
}

public class Main {
    public static void main(String[] args) {
        List<Product> productList = getProductList();
        System.out.println("Мебель:");
        for (Product product : productList) {
            System.out.println(product.name());
        }
        List<EmployeePosition> employeePositions = getEmployeePositions();
        System.out.println("Должности:");
        for (EmployeePosition employeePosition : employeePositions) {
            System.out.println(employeePosition.position());
        }
        System.out.println("Станки:");
        List<Equipment> equipmentList = getEquipmentList();
        for (Equipment equipment : equipmentList) {
            System.out.println(equipment.name() + ": " + equipment.quantity());
        }
        System.out.println("Материалы:");
        List<Material> materials = getMaterials();
        for (Material material : materials) {
            System.out.println(material.name());
        }
        System.out.println("Услуги:");
        List<Service> services = getServices();
        for (Service service : services) {
            System.out.println(service.name());
        }
    }

    public static List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Диван"));
        productList.add(new Product("Кровать"));
        productList.add(new Product("Гумибер"));
        productList.add(new Product("Максим"));
        productList.add(new Product("Табуретка"));
        return productList;
    }

    public static List<EmployeePosition> getEmployeePositions() {
        List<EmployeePosition> employeePositions = new ArrayList<>();
        employeePositions.add(new EmployeePosition("Аудитор"));
        employeePositions.add(new EmployeePosition("Аналитик"));
        employeePositions.add(new EmployeePosition("Администратор"));
        employeePositions.add(new EmployeePosition("Бухгалтер"));
        employeePositions.add(new EmployeePosition("Диспетчер"));
        return employeePositions;
    }

    public static List<Equipment> getEquipmentList() {
        List<Equipment> equipmentList = new ArrayList<>();
        equipmentList.add(new Equipment("Количество токарных станков", 15));
        equipmentList.add(new Equipment("Количество фрезерных станков", 105));
        equipmentList.add(new Equipment("Количество сверлильных станков", 666));
        equipmentList.add(new Equipment("Количество лазерных станков", 23));
        equipmentList.add(new Equipment("Количество пресс-станков", 32));
        return equipmentList;
    }

    public static List<Material> getMaterials() {
        List<Material> materials = new ArrayList<>();
        materials.add(new Material("Цельный массив дерева"));
        materials.add(new Material("Клееный массив дерева"));
        materials.add(new Material("Фанера"));
        materials.add(new Material("Древесно-стружечная плита"));
        return materials;
    }

    public static List<Service> getServices() {
        List<Service> services = new ArrayList<>();
        services.add(new Service("Распил"));
        services.add(new Service("Кромление"));
        services.add(new Service("Покраска"));
        services.add(new Service("Фрезеровка"));
        services.add(new Service("Присадка"));
        return services;
    }
}