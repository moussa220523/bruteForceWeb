<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="formulaire1.css" media="screen" type="text/css" />
    <title>formulaire</title>
</head>
<body>
<div id="container">
<form action="traitement.php" method="post">
 <h1>Connexion</h1>
 <label><b>Nom d'utilisateur</b></label>
    <input type="text" name="userName" />
    <br />
    <label><b>Mot de passe</b></label>
    <input type="password" name="userPassword" />
    <br />
    <input type="submit" name="connexion" value="Connexion" />
</form>
</div>
<?php

session_start();
if(isset($_POST['connexion'])){
    if(empty($_POST['userName'])){
        echo "Le champ Pseudo est vide.";
    } else {
        if(empty($_POST['userPassword'])){
            echo "Le champ Mot de passe est vide.";
        } else {
            $username = htmlentities($_POST['userName'], ENT_QUOTES, "UTF-8"); 
            $userpassword = htmlentities($_POST['userPassword'], ENT_QUOTES, "UTF-8");
            $mysqli = mysqli_connect("localhost", "root", "", "monsite");
            if(!$mysqli){
                echo "Erreur de connexion à la base de données.";
            } else {
                $Requete = mysqli_query($mysqli,"SELECT * FROM utilisateurs WHERE nom_utilisateur = '".$username."' AND password = '".$userpassword."'");
                if(mysqli_num_rows($Requete) == 0) {
                    echo "Le pseudo ou le mot de passe est incorrect, le compte n'a pas été trouvé.";
                } else {
                    $_SESSION['userName'] = $username;
                    header('location:index.php');
                    exit();
                }
            }
        }
    }
}
?>
    
</body>
</html>

