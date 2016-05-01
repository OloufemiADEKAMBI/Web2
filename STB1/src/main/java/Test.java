import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EntityManagerConnectionService;
import fr.STB1.model.Client;
import fr.STB1.model.Equipe;
import fr.STB1.model.ExigenceFonctionnelle;
import fr.STB1.model.Fonctionnalite;
import fr.STB1.model.Membre;
import fr.STB1.model.Stb;
import fr.STB1.model.StbList;
import fr.STB1.model.StbResume;
import services.ServiceStbImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StbList As = new StbList();
		ExigenceFonctionnelle c = new ExigenceFonctionnelle("adek", "romaric", 2);
		List<ExigenceFonctionnelle> l = new ArrayList<>();
		l.add(c);

		Fonctionnalite f = new Fonctionnalite(2,"ma fonctionnalite", 3, l);
		Fonctionnalite f1 = new Fonctionnalite(1,"ma 2 fonctionnalite", 4, l);
		List<Fonctionnalite> FF = new ArrayList<>();
		FF.add(f);
		//FF.add(f1);

		Equipe equipes = new Equipe();
		Membre a = new Membre("Yoan", "ziegler", false);
		Membre a11 = new Membre("Damien", "henry", false);
		Membre a111 = new Membre("Omar", "qette", false);
		equipes.getMembres().add(a);
		equipes.getMembres().add(a11);
		equipes.getMembres().add(a111);

		Client b = new Client("ddd", "dddd", "76130");

		String txtDate = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE).format(new Date());
		Stb s = new Stb("Agora", "5", txtDate, "conception de jeux",b,equipes,FF,"com");
		//Stb s=new Stb();
		//s.setClient(b);
		//s.setEquipe(equipes);
		//s.setFonctionnalite(FF);
		//s.setComment("nouveau format de commentaire");
		
		ServiceStbImpl service = new ServiceStbImpl();
		service.AddStb(s);
		
		
		
		/*Stb ss = service.getStbById(3);
		System.out.println(ss.getDescription());
		System.out.println(ss.getTitreProjet());
			
//		EntityManagerConnectionService.getInstance().getTransaction().begin();
//			EntityManagerConnectionService.getInstance().persist(s);
//			EntityManagerConnectionService.getInstance().getTransaction().commit();*/

	}

}
