package cleancode_pack;

public class House {
	public double FullyHomeCost(String MaterialStandard,double areaofhouseinFeets)
	{
		double cost=0;
		if(MaterialStandard.equals("StandardMaterials"))
		{
			cost=1200*(areaofhouseinFeets);
		}
		else if(MaterialStandard.equals("above StandardMaterials "))
			
		{
			cost=1500*(areaofhouseinFeets);
		}
		else if(MaterialStandard.equals("HighStandardMaterials"))
		{
			cost=1800*(areaofhouseinFeets);
		}
		else if(MaterialStandard.equals("HighStandardMaterialAndFullyAutomatedHome"))
		{
			cost=2500*(areaofhouseinFeets);
		}
		return cost;
	}

	}
	