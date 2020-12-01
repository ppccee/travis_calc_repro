public class CallActivity extends AppCompatActivity {
    Button b;
    Button b2;
    Button b3;
    EditText e;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        e=findViewById(R.id.editTextPhone);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XaaZjDFEtKw"));
                startActivity(i);
            }
        });
