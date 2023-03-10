package com.example.yourjourney;

import static com.example.yourjourney.Creatures.Creature.CreatureList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Forest extends AppCompatActivity {

    ImageView event;
    TextView title;
    TextView brief;
    TextView tv_decision1;
    TextView tv_decision2;
    TextView tv_decision3;
    TextView tv_hp;
    TextView tv_gold;
    TextView tv_atk;
    TextView tv_def;
    Button b_decision1;
    Button b_decision2;
    Button b_decision3;
    public int place;
    public static int i;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        title = findViewById(R.id.tv_miastowe);
        brief = findViewById(R.id.tv_oferta);
        event = findViewById(R.id.iv_miastowy);

        tv_atk = findViewById(R.id.tv_atak_w);
        tv_def = findViewById(R.id.tv_obrona_w);
        tv_hp = findViewById(R.id.tv_hp);
        tv_gold = findViewById(R.id.tv_gold1);
        tv_decision1 = findViewById(R.id.tv_decyzja_1);
        tv_decision2 = findViewById(R.id.tv_decyzja2);
        tv_decision3 = findViewById(R.id.tv_decyzja3);
        b_decision1 = findViewById(R.id.b_decyzja1);
        b_decision2 = findViewById(R.id.b_decyzja2);
        b_decision3 = findViewById(R.id.b_decyzja3);

        tv_hp.setText(String.valueOf(activity_main4.H_hp)+"/"+String.valueOf(activity_main4.H_hpmax));
        tv_gold.setText(String.valueOf(activity_main4.H_gold));
        tv_atk.setText(String.valueOf(activity_main4.H_atk));
        tv_def.setText(String.valueOf(activity_main4.H_def));

        if(place==0) {event1();}
        else if(place==1) {event2();}
        else if(place==2) {event3();}
        else if(place==3) {event4();}
        else if(place==4) {event5();}
        else if(place==5) {event6();}
        else if(place==6) {event7();}
    }

    //POCZ??TEK
    public void  event1() {
        place=0;
        title.setText("Stajesz na rozdro??u");
        event.setImageResource(R.drawable.land2_pola);
        brief.setText("Postanowi??e?? wyruszy?? w nieznane, jednak staj??c na rozdro??u, postanowi??e?? upewni?? si?? w swej decyzji.");
        tv_decision1.setText("id?? na pole");
        tv_decision2.setText("Id?? do lasu");
        tv_decision3.setText("Wr???? do punktu zbornego");

        b_decision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                event2();
            }
        });
        b_decision2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                event4();
            }
        });
        b_decision3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuSwitch = new Intent(getApplicationContext(), activity_main4.class);
                startActivity(menuSwitch);
            }
        });
    }

    public void  event2() {
        place=1;
        title.setText("Wchodzisz na pole");
        event.setImageResource(R.drawable.kwiotki_i_pola);
        brief.setText("Wchodz??c na pole, zauwa??asz przechodnia, kt??ry kieruje si?? ku miastu. Widzisz, ??e ma co?? w koszyku.");
        tv_decision1.setText("Zaatakuj go");
        tv_decision2.setText("Podejd?? do niego");
        tv_decision3.setText("Zignoruj go");

        b_decision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuSwitch = new Intent(getApplicationContext(), gameover.class);
                startActivity(menuSwitch);
            }
        });
        b_decision2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                event3();
            }
        });
        b_decision3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                event4();
            }
        });
    }

    public void  event3() {
        place=2;
        title.setText("Nieznajomy");
        event.setImageResource(R.drawable.przechodzien);
        brief.setText("Gdy podchodzisz do przechodnia, zauwa??asz, ??e co?? czyha w zaro??lach, gdy tylko was zauwa??a rzuca si?? na was. Zaczyna si?? walka.");
        tv_decision1.setText("O nie! Jestesmy zgubieni!");
        tv_decision2.setText("I tak to wygram, bo to wersja demonstracyjna");
        tv_decision3.setText("Uciekaj w pop??ochu");

        b_decision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                place=4;
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), Fight.class);
                startActivity(menuSwitch);
            }
        });
        b_decision2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                place=4;
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), Fight.class);
                startActivity(menuSwitch);
            }
        });
        b_decision3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                event7();
            }
        });
    }

    public void  event4() {
        place=3;
        title.setText("Wchodzisz do lasu");
        event.setImageResource(R.drawable.land2_pola);
        brief.setText("Wchodz??c do mrocznego lasu, zauwa??asz, ??e nie jeste?? tu sam.");
        tv_decision1.setText("O Bogowie! Walka!");
        tv_decision2.setText("O nie! Jeste??my zgubieni!");
        tv_decision3.setText("I tak to wygram, bo to wersja demonstracyjna");

        b_decision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                place=5;
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), Fight.class);
                startActivity(menuSwitch);
            }
        });
        b_decision2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                place=5;
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), Fight.class);
                startActivity(menuSwitch);
            }
        });
        b_decision3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                place=5;
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), Fight.class);
                startActivity(menuSwitch);
            }
        });
    }

    public void  event5() {
        place=4;
        title.setText("Zosta?? na chwil?? i pos??uchaj");
        event.setImageResource(R.drawable.przechodzien);
        brief.setText("Po pokonaniu stwora, przechodzie?? oferuje ci zap??at?? w wysoko??ci 5 sztuk z??ota za ocalenie mu ??ycia.");
        tv_decision1.setText("Przyjm?? tw??j podarek. Odprowadz?? ci?? do miasta, jest tutaj zbyt niebezpiecznie");
        tv_decision2.setText("Nie musisz mi dzi??kowa??. Odprowadz?? ci?? do miasta, jest tutaj zbyt niebezpiecznie");
        tv_decision3.setText("Podw??jne racje? ??wietnie!");

        b_decision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuSwitch = new Intent(getApplicationContext(), activity_main4.class);
                startActivity(menuSwitch);
            }
        });
        b_decision2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), activity_main4.class);
                startActivity(menuSwitch);
            }
        });
        b_decision3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), activity_main4.class);
                startActivity(menuSwitch);
            }
        });
    }

    public void  event6() {
        place=5;
        title.setText("Zbyt gro??nie");
        event.setImageResource(R.drawable.przechodzien);
        brief.setText("Ten las jest zbyt gro??ny by?? m??g?? go eksplorowa??.");
        tv_decision1.setText("Uciekajcie!");
        tv_decision2.setText("Zbyt Straszne!");
        tv_decision3.setText("Szok!");

        b_decision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuSwitch = new Intent(getApplicationContext(), activity_main4.class);
                startActivity(menuSwitch);
            }
        });
        b_decision2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), activity_main4.class);
                startActivity(menuSwitch);
            }
        });
        b_decision3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i = rand.nextInt((5 - 2 +1) +2);
                Intent menuSwitch = new Intent(getApplicationContext(), activity_main4.class);
                startActivity(menuSwitch);
            }
        });
    }

    public void  event7() {
        place=6;
        title.setText("Uciekasz");
        event.setImageResource(R.drawable.pathetic);
        brief.setText("Uciekasz przed przeciwnikiem. Spogl??daj??c przez rami?? widzisz, jak przechodzie?? jest rozszarpywany przez stwora.");
        tv_decision1.setText("Wracaj do miasta");
        tv_decision2.setText("Wracaj do punktu zbornego");
        tv_decision3.setText("Wracaj na rozdro??e");

        b_decision1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuSwitch = new Intent(getApplicationContext(), City.class);
                startActivity(menuSwitch);
            }
        });
        b_decision2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuSwitch = new Intent(getApplicationContext(), activity_main4.class);
                startActivity(menuSwitch);
            }
        });
        b_decision3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                event1();
            }
        });
    }


}