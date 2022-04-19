package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        view.getInputs();
        String name = model.getName();
        double income = model.getIncome(model.getQuantity(), model.getPrice());
        String roundIncome = Rounder.round(income);
        double fiscal = model.getFiscal(model.getQuantity(), model.getPrice());
        String roundFiscal = Rounder.round(fiscal);
        double profit = model.getProfit(model.getQuantity(), model.getPrice());
        String roundProfit = Rounder.round(profit);

        String output = "Наименование товара: " + name +
                "\nОбщий доход (грн.): " + roundIncome +
                "\nСумма налога (грн.): " + roundFiscal +
                "\nЧистый доход (грн.): " + roundProfit;

        view.getOutput(output);
    }
}
