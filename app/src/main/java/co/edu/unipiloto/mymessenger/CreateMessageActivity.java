package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        Intent intent=getIntent();
        String messageText=intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView=(TextView)findViewById(R.id.messages);
        messageView.setText(messageText);
    }
    public void onSendMessage(View view){
        EditText messageView=(EditText) findViewById(R.id.message);
        String messageText=messageView.getText().toString();
        Intent intent=new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        startActivity(intent);
    }
}