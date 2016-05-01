//package fr.STB1.controller;
//
//import fr.*;
//
//import java.lang.reflect.Array;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import fr.STB1.model.Client;
//import fr.STB1.model.ExigenceFonctionnelle;
//import fr.STB1.model.Fonctionnalite;
//import fr.STB1.model.ListResume;
//import fr.STB1.model.Membre;
//import fr.STB1.model.Stb;
//import fr.STB1.model.StbList;
//import fr.STB1.model.StbResume;
//import fr.STB1.model.Equipe;
//
//@RestController
//public class HomeController {
//
//	@RequestMapping(value = "/All")
//	public @ResponseBody StbList afficher_stb() {
//
//		StbList As = new StbList();
//		ExigenceFonctionnelle c = new ExigenceFonctionnelle("adek", "romaric", 2);
//		List<ExigenceFonctionnelle> l = new ArrayList<>();
//		l.add(c);
//
//		Fonctionnalite f = new Fonctionnalite(1,"ma fonctionnalite", 3, l);
//		Fonctionnalite f1 = new Fonctionnalite(2,"ma 2 fonctionnalite", 4, l);
//		List<Fonctionnalite> FF = new ArrayList<>();
//		FF.add(f);
//		FF.add(f1);
//
//		Equipe equipes = new Equipe();
//		Membre a = new Membre("Yoan", "ziegler", false);
//		Membre a11 = new Membre("Damien", "henry", false);
//		Membre a111 = new Membre("Omar", "qette", false);
//		equipes.getMembres().add(a);
//		equipes.getMembres().add(a11);
//		equipes.getMembres().add(a111);
//
//		Client b = new Client("ddd", "dddd", "76130");
//
//		String txtDate = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE).format(new Date());
//		Stb s = new Stb(1, "Agora", "5", txtDate, "conception de jeux");
//		s.setClient(b);
//		s.setEquipe(equipes);
//		s.setFonctionnalite(FF);
//		s.setComment("nouveau format de commentaire");
//
//		// Deuxième STB
//
//		ExigenceFonctionnelle c1 = new ExigenceFonctionnelle("oloufemi", "romaric", 2);
//		List<ExigenceFonctionnelle> l1 = new ArrayList<>();
//		l1.add(c1);
//
//		Fonctionnalite f2 = new Fonctionnalite("mon autre fonctionnalite", 4, l1);
//		Fonctionnalite f22 = new Fonctionnalite("mon autre 2 fonctionnalite", 8, l1);
//		List<Fonctionnalite> F1 = new ArrayList<>();
//		F1.add(f2);
//		F1.add(f22);
//
//		Client b1 = new Client("Bruno", "Patrou", "76130");
//
//		Equipe equipes2 = new Equipe();
//		Membre a2 = new Membre("Abdou", "rahim", false);
//		Membre a22 = new Membre("Ridhouane", "hh", false);
//		Membre a222 = new Membre("Baba", "Chez", false);
//		equipes2.getMembres().add(a2);
//		equipes2.getMembres().add(a22);
//		equipes2.getMembres().add(a222);
//
//		Stb s1 = new Stb(2, "NBA", "2", txtDate, "Championnat de Basket");
//		s1.setClient(b1);
//		s1.setEquipe(equipes2);
//		s1.setFonctionnalite(F1);
//		s1.setComment("on parle de sport");
//
//		As.getList().add(s);
//		As.getList().add(s1);
//
//		return As;
//	}
//
//	@RequestMapping(value = "/resume")
//	public @ResponseBody ListResume afficher_Resumestb() {
//
//		StbList As = new StbList();
//		ExigenceFonctionnelle c = new ExigenceFonctionnelle("adek", "romaric", 2);
//		List<ExigenceFonctionnelle> l = new ArrayList<>();
//		l.add(c);
//
//		Fonctionnalite f = new Fonctionnalite("ma fonctionnalite", 3, l);
//		Fonctionnalite f1 = new Fonctionnalite("ma 2 fonctionnalite", 4, l);
//		List<Fonctionnalite> FF = new ArrayList<>();
//		FF.add(f);
//		FF.add(f1);
//
//		String txtDate = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE).format(new Date());
//		Equipe equipes = new Equipe();
//		Membre a = new Membre("Yoan", "ziegler", false);
//		Membre a11 = new Membre("Damien", "henry", false);
//		Membre a111 = new Membre("Omar", "qette", false);
//		equipes.getMembres().add(a);
//		equipes.getMembres().add(a11);
//		equipes.getMembres().add(a111);
//
//		Client b = new Client("ddd", "dddd", "76130");
//
//		Stb s = new Stb(1, "Agora", "5", txtDate, "conception de jeux");
//		s.setClient(b);
//		s.setEquipe(equipes);
//		s.setFonctionnalite(FF);
//		s.setComment("nouveau format de commentaire");
//
//		// Deuxième STB
//
//		ExigenceFonctionnelle c1 = new ExigenceFonctionnelle("oloufemi", "romaric", 2);
//		List<ExigenceFonctionnelle> l1 = new ArrayList<>();
//		l1.add(c1);
//
//		Fonctionnalite f2 = new Fonctionnalite("mon autre fonctionnalite", 4, l1);
//		Fonctionnalite f22 = new Fonctionnalite("mon autre 2 fonctionnalite", 8, l1);
//		List<Fonctionnalite> F1 = new ArrayList<>();
//		F1.add(f2);
//		F1.add(f22);
//
//		Client b1 = new Client("Bruno", "Patrou", "76130");
//
//		Equipe equipes2 = new Equipe();
//		Membre a2 = new Membre("Abdou", "rahim", false);
//		Membre a22 = new Membre("Ridhouane", "hh", false);
//		Membre a222 = new Membre("Baba", "Chez", false);
//		equipes2.getMembres().add(a2);
//		equipes2.getMembres().add(a22);
//		equipes2.getMembres().add(a222);
//
//		Stb s1 = new Stb(2, "NBA", "2", txtDate, "Championnat de Basket");
//		s1.setClient(b1);
//		s1.setEquipe(equipes2);
//		s1.setFonctionnalite(F1);
//		s1.setComment("on parle de sport");
//
//		As.getList().add(s);
//		As.getList().add(s1);
//
//		// Les resume
//		StbResume rs = new StbResume();
//		StbResume rs1 = new StbResume();
//		rs.setId(s.getId());
//		rs.setTitreProjet(s.getTitreProjet());
//		rs.setVersion(s.getVersion());
//		rs.setDescription(s.getDescription());
//		rs.setDate(s.getDate());
//
//		rs1.setId(s1.getId());
//		rs1.setTitreProjet(s1.getTitreProjet());
//		rs1.setVersion(s1.getVersion());
//		rs1.setDescription(s1.getDescription());
//		rs1.setDate(s1.getDate());
//		ListResume LR = new ListResume();
//
//		LR.getStb().add(rs);
//		LR.getStb().add(rs1);
//
//		return LR;
//	}
//
//	@RequestMapping(value = "/resume/{id}")
//	public @ResponseBody Stb afficher_ResumeParId(@PathVariable("id") int id) {
//
//		StbList As = new StbList();
//		ExigenceFonctionnelle c = new ExigenceFonctionnelle("adek", "romaric", 2);
//		List<ExigenceFonctionnelle> l = new ArrayList<>();
//		l.add(c);
//
//		Fonctionnalite f = new Fonctionnalite("ma fonctionnalite", 3, l);
//		Fonctionnalite f1 = new Fonctionnalite("ma 2 fonctionnalite", 4, l);
//		List<Fonctionnalite> FF = new ArrayList<>();
//		FF.add(f);
//		FF.add(f1);
//
//		String txtDate = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE).format(new Date());
//		Equipe equipes = new Equipe();
//		Membre a = new Membre("Yoan", "ziegler", false);
//		Membre a11 = new Membre("Damien", "henry", false);
//		Membre a111 = new Membre("Omar", "qette", false);
//		equipes.getMembres().add(a);
//		equipes.getMembres().add(a11);
//		equipes.getMembres().add(a111);
//
//		Client b = new Client("ddd", "dddd", "76130");
//
//		Stb s = new Stb(1, "Agora", "5", txtDate, "conception de jeux");
//		s.setClient(b);
//		s.setEquipe(equipes);
//		s.setFonctionnalite(FF);
//		s.setComment("nouveau format de commentaire");
//
//		// Deuxième STB
//
//		ExigenceFonctionnelle c1 = new ExigenceFonctionnelle("oloufemi", "romaric", 2);
//		List<ExigenceFonctionnelle> l1 = new ArrayList<>();
//		l1.add(c1);
//
//		Fonctionnalite f2 = new Fonctionnalite("mon autre fonctionnalite", 4, l1);
//		Fonctionnalite f22 = new Fonctionnalite("mon autre 2 fonctionnalite", 8, l1);
//		List<Fonctionnalite> F1 = new ArrayList<>();
//		F1.add(f2);
//		F1.add(f22);
//
//		Client b1 = new Client("Bruno", "Patrou", "76130");
//
//		Equipe equipes2 = new Equipe();
//		Membre a2 = new Membre("Abdou", "rahim", false);
//		Membre a22 = new Membre("Ridhouane", "hh", false);
//		Membre a222 = new Membre("Baba", "Chez", false);
//		equipes2.getMembres().add(a2);
//		equipes2.getMembres().add(a22);
//		equipes2.getMembres().add(a222);
//
//		Stb s1 = new Stb(2, "NBA", "2", txtDate, "Championnat de Basket");
//		s1.setClient(b1);
//		s1.setEquipe(equipes2);
//		s1.setFonctionnalite(F1);
//		s1.setComment("on parle de sport");
//
//		As.getList().add(s);
//		As.getList().add(s1);
//
//		Stb agg = new Stb();
//		agg = searchById(As, id);
//		return agg;
//	}
//
//	public Stb searchById(StbList l, int identifiant) {
//		for (Stb stbid : l.getList()) {
//			int a = stbid.getId();
//			if (a == identifiant)
//				return stbid;
//		}
//		return null;
//
//	}
//
//	@RequestMapping(value = "/Acceuil")
//	public @ResponseBody String Acceuil() {
//
//		System.out.println(
//				"Bienvenu sur votre application de gestion de vos STB /n La plateforme compte actuellement 3 stb.");
//		ExigenceFonctionnelle c = new ExigenceFonctionnelle("adek", "romaric", 2);
//		List<ExigenceFonctionnelle> l = new ArrayList<>();
//		l.add(c);
//
//		Fonctionnalite f = new Fonctionnalite("ma fonctionnalite", 3, l);
//		Fonctionnalite f1 = new Fonctionnalite("ma 2 fonctionnalite", 4, l);
//		List<Fonctionnalite> FF = new ArrayList<>();
//		FF.add(f);
//		FF.add(f1);
//
//		Equipe equipes = new Equipe();
//		Membre a = new Membre("Yoan", "ziegler", false);
//		Membre a11 = new Membre("Damien", "henry", false);
//		Membre a111 = new Membre("Omar", "qette", false);
//		equipes.getMembres().add(a);
//		equipes.getMembres().add(a11);
//		equipes.getMembres().add(a111);
//
//		Client b = new Client("ddd", "dddd", "76130");
//
//		String txtDate = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE).format(new Date());
//		Stb s = new Stb(1, "Agora", "5", "dd", "conception de jeux");
//		s.setClient(b);
//		s.setEquipe(equipes);
//		s.setFonctionnalite(FF);
//		s.setComment("nouveau format de commentaire");
//
//		Validate v = new Validate();
//		if (v.ValidationWithObject(s))
//			return "Toutes les STB présentes actuellement sont valides";
//		else
//			return "problème de validation avec certaines Présentes";
//	}
//}
