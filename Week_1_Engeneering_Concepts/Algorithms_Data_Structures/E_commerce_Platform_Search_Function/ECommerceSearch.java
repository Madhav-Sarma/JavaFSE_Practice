package Week_1_Engeneering_Concepts.Algorithms_Data_Structures.E_commerce_Platform_Search_Function;

import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {
    public static Product linearSerach(Product[] products,String targetName){
        for(Product p: products){
            if(p.productName.equalsIgnoreCase(targetName)){
                return p;
            }
        }
        return null;
    }

    public static Product binSearch(Product[] products,String targetName){
        Arrays.sort(products, Comparator.comparing(p->p.productName.toLowerCase()));
        int low = 0, high = products.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int cmp = targetName.compareToIgnoreCase(products[mid].productName);
            if(cmp == 0){
                return products[mid];
            } else if (cmp<0) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return null;
    }

    public static void main(String[] args){
        Product[] products={
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shirt", "Clothing"),
                new Product(103, "Book", "Education"),
                new Product(104, "Smartphone", "Electronics"),
                new Product(105, "Jeans", "Clothing"),
                new Product(106, "Notebook", "Education"),
                new Product(107, "Headphones", "Electronics"),
                new Product(108, "Shoes", "Footwear"),
                new Product(109, "Pen", "Stationery"),
                new Product(110, "Backpack", "Accessories"),
                new Product(111, "Monitor", "Electronics"),
                new Product(112, "Jacket", "Clothing"),
                new Product(113, "Socks", "Footwear"),
                new Product(114, "Calculator", "Education"),
                new Product(115, "Tablet", "Electronics")
        };

        Product resultBin = binSearch(products, "jacket");
        Product resultLin = linearSerach(products, "eraser");

        System.out.print("Linear Search Result: ");
        System.out.println((resultLin != null ? "Found: " + resultLin.productName + " (" + resultLin.category + ")" : "Not found"));
        System.out.print("Binary Search Result: ");
        System.out.println((resultBin != null ? "Found: " + resultBin.productName + " (" + resultBin.category + ")" : "Not found"));
    }
}
