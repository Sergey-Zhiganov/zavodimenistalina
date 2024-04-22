import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ProductList = ListProduct();
        print(ProductList);
        List<String> DolznotbList = SpisokDolznostey();
        print(DolznotbList);
        List<String> KolichestvoStankov = StankiQ();
        print(KolichestvoStankov);
        List<String> Material = Materials();
        print(Material);
        List <String> Services = Uslugi();
        print(Services);
    }
    static void print(List<String> list) {
        for (Object element : list.toArray())
            System.out.println(element);
    }
    public static List<String> ListProduct()
    {
        return new ArrayList<>(Arrays.asList("Продукция:", "Диван", "Кровать", "Гумибер", "Максим", "Табуретка"));
    }
    public static List<String> SpisokDolznostey()
    {
        return new ArrayList<>(Arrays.asList("Список должностей:", "Аудитор", "Аналитик", "Администратор", "Бухгалтер", "Диспетчер"));
    }
    public static List<String> StankiQ()
    {
        return new ArrayList<>(Arrays.asList("Количество рабочих станков:", "15", "105", "666", "23", "32"));
    }

    public static List <String> Materials()
    {
        return new ArrayList<>(Arrays.asList("Материалы: ", "Цельный массив дерева", "Клееный массив дерева", "Фанера", "Древесно-стружечная плита"));
    }

    public static List <String> Uslugi()
    {
        return new ArrayList<>(Arrays.asList("Распил", "Кромление", "Покраска", "Фрезеровка", "Присадка"));
    }
}
