# springAPI
Création d'une api avec spring
### Le projet s'exécute sur le port 2000 ###
### pour accéder à nos endPoints ###

### pour la salle ###
** localhost:2000/salles/read 
** localhost:2000/personnes/create
** localhost:2000/salles/delete/id
** localhost:2000/salles/update/id

### pour la voitures ###
** localhost:2000/voitures/read 
** localhost:2000/voitures/create
** localhost:2000/voitures/delete/id
** localhost:2000/voitures/update/id

### pour la mariages ###
** localhost:2000/mariages/read 
** localhost:2000/mariages/create
** localhost:2000/mariages/delete/id
** localhost:2000/mariages/update/id

### pour la invites ###
** localhost:2000/invites/read 
** localhost:2000/invites/create
** localhost:2000/invites/delete/id
** localhost:2000/invites/update/id

-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : dim. 19 mars 2023 à 22:34
-- Version du serveur : 8.0.31
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `springdb`
--

-- --------------------------------------------------------

--
-- Structure de la table `invite`
--

DROP TABLE IF EXISTS `invite`;
CREATE TABLE IF NOT EXISTS `invite` (
  `id_invite` bigint NOT NULL AUTO_INCREMENT,
  `status` varchar(255) DEFAULT NULL,
  `id_personne` bigint DEFAULT NULL,
  PRIMARY KEY (`id_invite`),
  KEY `FKfa8vf325idq7occ4lxvhwa7aq` (`id_personne`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `invite`
--

INSERT INTO `invite` (`id_invite`, `status`, `id_personne`) VALUES
(1, 'temoin', 1),
(2, 'invité', 2),
(3, 'temoin', 4);

-- --------------------------------------------------------

--
-- Structure de la table `mariage`
--

DROP TABLE IF EXISTS `mariage`;
CREATE TABLE IF NOT EXISTS `mariage` (
  `id_mariage` bigint NOT NULL AUTO_INCREMENT,
  `date_mariage` date DEFAULT NULL,
  `id_personne` bigint DEFAULT NULL,
  PRIMARY KEY (`id_mariage`),
  KEY `FKixd4ro8s3mbcpvkqbfa0aptxf` (`id_personne`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `mariage`
--

INSERT INTO `mariage` (`id_mariage`, `date_mariage`, `id_personne`) VALUES
(1, '2023-03-18', 4),
(2, '1955-11-25', 5),
(3, '2012-12-30', 4),
(4, '1995-11-05', 2),
(5, '1975-11-05', 4);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `id_personne` bigint NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `sexe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_personne`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`id_personne`, `nom`, `prenom`, `sexe`) VALUES
(1, 'sedji', 'germain', 'masculin'),
(2, 'totti', 'germaine', 'feminin'),
(3, 'loulouu', 'ghotier', 'feminin'),
(4, 'big Mic', 'ghotier', 'feminin'),
(5, 'Dom', 'ghost', 'masculin');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `id_salle` bigint NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) DEFAULT NULL,
  `capacite` int DEFAULT NULL,
  `nom_salle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_salle`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`id_salle`, `adresse`, `capacite`, `nom_salle`) VALUES
(1, 'Rue des martyrs', 25, 'martyrs'),
(5, 'Rue des totsi', 15, 'totsi'),
(6, 'Rue des soviepe', 18, 'soviepe'),
(7, 'Rue des gblenkome', 25, 'gblenkome'),
(8, 'Rue des freres', 30, 'freres'),
(10, 'Rue des tchaoudo', 56, 'tchaoudo'),
(12, 'Rue des voltic', 12, 'voltic');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `invite`
--
ALTER TABLE `invite`
  ADD CONSTRAINT `FKfa8vf325idq7occ4lxvhwa7aq` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id_personne`);

--
-- Contraintes pour la table `mariage`
--
ALTER TABLE `mariage`
  ADD CONSTRAINT `FKixd4ro8s3mbcpvkqbfa0aptxf` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id_personne`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
