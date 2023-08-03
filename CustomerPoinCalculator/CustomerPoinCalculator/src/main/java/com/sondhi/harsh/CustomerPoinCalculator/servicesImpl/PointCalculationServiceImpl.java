package com.sondhi.harsh.CustomerPoinCalculator.servicesImpl;

import com.sondhi.harsh.CustomerPoinCalculator.servicesinterfaces.PointCalculationService;
import org.springframework.stereotype.Service;

@Service
public class PointCalculationServiceImpl implements PointCalculationService {

    @Override
    public int calculatePoints(double purchaseAmount) {
        int points = 0;

        if (purchaseAmount > 100) {
            points += 2 * (int) (purchaseAmount - 100);
            purchaseAmount = 100; // Only consider the amount between $50 and $100 for the next step
        }

        if (purchaseAmount > 50) {
            points += (int) (purchaseAmount - 50);
        }

        return points;
    }

}
