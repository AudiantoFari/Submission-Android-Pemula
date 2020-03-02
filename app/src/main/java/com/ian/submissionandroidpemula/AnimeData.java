package com.ian.submissionandroidpemula;

import java.util.ArrayList;

public class AnimeData {
    private static String[] animeNames = {
            "Death Note",
            "Shingeki no Kyojin",
            "Sword Art Online",
            "Fullmetal Alchemist: Brotherhood",
            "One Punch Man",
            "Tokyo Ghoul",
            "Steins;Gate",
            "No Game No Life",
            "Naruto",
            "Boku no Hero Academia"
    };

    private static String[] animeDetails = {
            "Episode \t= 37 \nRating \t\t= 8.63 \nGenre \t\t= Mystery, Police, Psychological, Supernatural, Thriller, Shounen",
            "Episode \t= 25 \nRating \t\t= 8.45 \nGenre \t\t= Action, Military, Mystery, Super Power, Drama, Fantasy, Shounen",
            "Episode \t= 25 \nRating \t\t= 7.43 \nGenre \t\t= Action, Adventure, Fantasy, Game, Romance",
            "Episode \t= 64 \nRating \t\t= 9.23 \nGenre \t\t= Action, Military, Adventure, Comedy, Drama, Magic, Fantasy, Shounen",
            "Episode \t= 12 \nRating \t\t= 8.67 \nGenre \t\t= Action, Sci-Fi, Comedy, Parody, Super Power, Supernatural, Seinen",
            "Episode \t= 12 \nRating \t\t= 7.88 \nGenre \t\t= Action, Mystery, Horror, Psychological, Supernatural, Drama, Seinen",
            "Episode \t= 24 \nRating \t\t= 9.14 \nGenre \t\t= Thriller, Sci-Fi",
            "Episode \t= 12 \nRating \t\t= 8.32 \nGenre \t\t= Game, Adventure, Comedy, Supernatural, Ecchi, Fantasy",
            "Episode \t= 220 \nRating \t\t= 7.87 \nGenre \t\t= Action, Adventure, Comedy, Super Power, Martial Arts, Shounen",
            "Episode \t= 13 \nRating \t\t= 8.32 \nGenre \t\t= Action, Comedy, School, Shounen, Super Power"
    };

    private static int[] animePosters = {
            R.drawable.death_note,
            R.drawable.shingeki_no_kyojin,
            R.drawable.sword_art_online,
            R.drawable.fullmetal_alchemy,
            R.drawable.one_punch_man,
            R.drawable.tokyo_ghoul,
            R.drawable.steins_gate,
            R.drawable.no_game_no_life,
            R.drawable.naruto,
            R.drawable.boku_no_hero
    };

    private static String[] animeSynopsis = {
     /* Death Note */  "A shinigami, as a god of death, can kill any person—provided they see their victim's face and write their victim's name in a notebook called a Death Note. One day, Ryuk, bored by the shinigami lifestyle and interested in seeing how a human would use a Death Note, drops one into the human realm.\n" +
                    "\n" +
                    "High school student and prodigy Light Yagami stumbles upon the Death Note and—since he deplores the state of the world—tests the deadly notebook by writing a criminal's name in it. When the criminal dies immediately following his experiment with the Death Note, Light is greatly surprised and quickly recognizes how devastating the power that has fallen into his hands could be.\n" +
                    "\n" +
                    "With this divine capability, Light decides to extinguish all criminals in order to build a new world where crime does not exist and people worship him as a god. Police, however, quickly discover that a serial killer is targeting criminals and, consequently, try to apprehend the culprit. To do this, the Japanese investigators count on the assistance of the best detective in the world: a young and eccentric man known only by the name of L.",

    /* Shingeki no Kyojin */ "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures called titans, forcing humans to hide in fear behind enormous concentric walls. What makes these giants truly terrifying is that their taste for human flesh is not born out of hunger but what appears to be out of pleasure. To ensure their survival, the remnants of humanity began living within defensive barriers, resulting in one hundred years without a single titan encounter. However, that fragile calm is soon shattered when a colossal titan manages to breach the supposedly impregnable outer wall, reigniting the fight for survival against the man-eating abominations.\n" +
                            "\n" +
                            "After witnessing a horrific personal loss at the hands of the invading creatures, Eren Yeager dedicates his life to their eradication by enlisting into the Survey Corps, an elite military unit that combats the merciless humanoids outside the protection of the walls. Based on Hajime Isayama's award-winning manga, Shingeki no Kyojin follows Eren, along with his adopted sister Mikasa Ackerman and his childhood friend Armin Arlert, as they join the brutal war against the titans and race to discover a way of defeating them before the last walls are breached.",

    /* Sword Art Online */ "In the year 2022, virtual reality has progressed by leaps and bounds, and a massive online role-playing game called Sword Art Online (SAO) is launched. With the aid of \"NerveGear\" technology, players can control their avatars within the game using nothing but their own thoughts.\n" +
            "\n" +
            "Kazuto Kirigaya, nicknamed \"Kirito,\" is among the lucky few enthusiasts who get their hands on the first shipment of the game. He logs in to find himself, with ten-thousand others, in the scenic and elaborate world of Aincrad, one full of fantastic medieval weapons and gruesome monsters. However, in a cruel turn of events, the players soon realize they cannot log out; the game's creator has trapped them in his new world until they complete all one hundred levels of the game.\n" +
            "\n" +
            "In order to escape Aincrad, Kirito will now have to interact and cooperate with his fellow players. Some are allies, while others are foes, like Asuna Yuuki, who commands the leading group attempting to escape from the ruthless game. To make matters worse, Sword Art Online is not all fun and games: if they die in Aincrad, they die in real life. Kirito must adapt to his new reality, fight for his survival, and hopefully break free from his virtual hell.",

    /*Fullmetal Alchemy */ "\"In order for something to be obtained, something of equal value must be lost.\"\n" +
            "\n" +
            "Alchemy is bound by this Law of Equivalent Exchange—something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression—Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their original bodies that gives Edward the inspiration to obtain metal limbs called \"automail\" and become a state alchemist, the Fullmetal Alchemist.\n" +
            "\n" +
            "Three years of searching later, the brothers seek the Philosopher's Stone, a mythical relic that allows an alchemist to overcome the Law of Equivalent Exchange. Even with military allies Colonel Roy Mustang, Lieutenant Riza Hawkeye, and Lieutenant Colonel Maes Hughes on their side, the brothers find themselves caught up in a nationwide conspiracy that leads them not only to the true nature of the elusive Philosopher's Stone, but their country's murky history as well. In between finding a serial killer and racing against time, Edward and Alphonse must ask themselves if what they are doing will make them human again... or take away their humanity.",

    /* One Punch Man */ "The seemingly ordinary and unimpressive Saitama has a rather unique hobby: being a hero. In order to pursue his childhood dream, he trained relentlessly for three years—and lost all of his hair in the process. Now, Saitama is incredibly powerful, so much so that no enemy is able to defeat him in battle. In fact, all it takes to defeat evildoers with just one punch has led to an unexpected problem—he is no longer able to enjoy the thrill of battling and has become quite bored.\n" +
            "\n" +
            "This all changes with the arrival of Genos, a 19-year-old cyborg, who wishes to be Saitama's disciple after seeing what he is capable of. Genos proposes that the two join the Hero Association in order to become certified heroes that will be recognized for their positive contributions to society, and Saitama, shocked that no one knows who he is, quickly agrees. And thus begins the story of One Punch Man, an action-comedy that follows an eccentric individual who longs to fight strong enemies that can hopefully give him the excitement he once felt and just maybe, he'll become popular in the process.",

    /* Tokyo Ghoul */ "Tokyo has become a cruel and merciless city—a place where vicious creatures called “ghouls” exist alongside humans. The citizens of this once great metropolis live in constant fear of these bloodthirsty savages and their thirst for human flesh. However, the greatest threat these ghouls pose is their dangerous ability to masquerade as humans and blend in with society.\n" +
            "\n" +
            "Based on the best-selling supernatural horror manga by Sui Ishida, Tokyo Ghoul follows Ken Kaneki, a shy, bookish college student, who is instantly drawn to Rize Kamishiro, an avid reader like himself. However, Rize is not exactly who she seems, and this unfortunate meeting pushes Kaneki into the dark depths of the ghouls' inhuman world. In a twist of fate, Kaneki is saved by the enigmatic waitress Touka Kirishima, and thus begins his new, secret life as a half-ghoul/half-human who must find a way to integrate into both societies.",

    /* Steins;Gate */ "The self-proclaimed mad scientist Rintarou Okabe rents out a room in a rickety old building in Akihabara, where he indulges himself in his hobby of inventing prospective \"future gadgets\" with fellow lab members: Mayuri Shiina, his air-headed childhood friend, and Hashida Itaru, a perverted hacker nicknamed \"Daru.\" The three pass the time by tinkering with their most promising contraption yet, a machine dubbed the \"Phone Microwave,\" which performs the strange function of morphing bananas into piles of green gel.\n" +
            "\n" +
            "Though miraculous in itself, the phenomenon doesn't provide anything concrete in Okabe's search for a scientific breakthrough; that is, until the lab members are spurred into action by a string of mysterious happenings before stumbling upon an unexpected success—the Phone Microwave can send emails to the past, altering the flow of history.\n" +
            "\n" +
            "Adapted from the critically acclaimed visual novel by 5pb. and Nitroplus, Steins;Gate takes Okabe through the depths of scientific theory and practicality. Forced across the diverging threads of past and present, Okabe must shoulder the burdens that come with holding the key to the realm of time.",

    /* No Game No Life */ "No Game No Life is a surreal comedy that follows Sora and Shiro, shut-in NEET siblings and the online gamer duo behind the legendary username \"Blank.\" They view the real world as just another lousy game; however, a strange e-mail challenging them to a chess match changes everything—the brother and sister are plunged into an otherworldly realm where they meet Tet, the God of Games.\n" +
            "\n" +
            "The mysterious god welcomes Sora and Shiro to Disboard, a world where all forms of conflict—from petty squabbles to the fate of whole countries—are settled not through war, but by way of high-stake games. This system works thanks to a fundamental rule wherein each party must wager something they deem to be of equal value to the other party's wager. In this strange land where the very idea of humanity is reduced to child's play, the indifferent genius gamer duo of Sora and Shiro have finally found a real reason to keep playing games: to unite the sixteen races of Disboard, defeat Tet, and become the gods of this new, gaming-is-everything world.",

    /* Naruto */ "Moments prior to Naruto Uzumaki's birth, a huge demon known as the Kyuubi, the Nine-Tailed Fox, attacked Konohagakure, the Hidden Leaf Village, and wreaked havoc. In order to put an end to the Kyuubi's rampage, the leader of the village, the Fourth Hokage, sacrificed his life and sealed the monstrous beast inside the newborn Naruto.\n" +
            "\n" +
            "Now, Naruto is a hyperactive and knuckle-headed ninja still living in Konohagakure. Shunned because of the Kyuubi inside him, Naruto struggles to find his place in the village, while his burning desire to become the Hokage of Konohagakure leads him not only to some great new friends, but also some deadly foes.",

    /* Boku no Hero */ "The appearance of \"quirks,\" newly discovered super powers, has been steadily increasing over the years, with 80 percent of humanity possessing various abilities from manipulation of elements to shapeshifting. This leaves the remainder of the world completely powerless, and Izuku Midoriya is one such individual.\n" +
            "\n" +
            "Since he was a child, the ambitious middle schooler has wanted nothing more than to be a hero. Izuku's unfair fate leaves him admiring heroes and taking notes on them whenever he can. But it seems that his persistence has borne some fruit: Izuku meets the number one hero and his personal idol, All Might. All Might's quirk is a unique ability that can be inherited, and he has chosen Izuku to be his successor!\n" +
            "\n" +
            "Enduring many months of grueling training, Izuku enrolls in UA High, a prestigious high school famous for its excellent hero training program, and this year's freshmen look especially promising. With his bizarre but talented classmates and the looming threat of a villainous organization, Izuku will soon learn what it really means to be a hero."
    };

    static ArrayList<Anime> getListData() {
        ArrayList<Anime> list = new ArrayList<>();
        for (int a = 0; a < animeNames.length; a++) {
            Anime anime = new Anime();
            anime.setName(animeNames[a]);
            anime.setDetail(animeDetails[a]);
            anime.setPoster(animePosters[a]);
            anime.setSynopsis(animeSynopsis[a]);
            list.add(anime);
        }

        return list;
    }
}
