package com.example.applications;




import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends  RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private Context mCtx;

    //we are storing all the products in a list
    private List<Table> examples;

    public ContactAdapter(Context mCtx, List<Table> examples) {
        this.mCtx = mCtx;
        this.examples = examples;
    }


//TextView name,phoneno,emailid,college,sorce,course,status,reg,comment;

    @NonNull
    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.recyclerview, null);
        return new ContactViewHolder(view);

    }


    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Table example1 = examples.get(position);
        holder.name.setText(example1.getName());
        holder.phoneno.setText(example1.getPhoneno());
        holder.emailid.setText(example1.getEmailid());
        holder.college.setText(example1.getCollege());
        holder.sorce.setText(example1.getSource());
        holder.course.setText(example1.getCourse());
        holder.status.setText(example1.getStatus());
        holder.reg.setText(example1.getRegDate());
        holder.comment.setText(example1.getComment());



    }

    @Override
    public int getItemCount() {
        return examples.size() ;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView name, phoneno, emailid, college, sorce, course, status, reg, comment;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.rname);
            phoneno = itemView.findViewById(R.id.rphone);
            emailid = itemView.findViewById(R.id.remail);
            college = itemView.findViewById(R.id.rcollege);
            sorce = itemView.findViewById(R.id.rsource);
            course = itemView.findViewById(R.id.rcourse);
            college = itemView.findViewById(R.id.rcollege);

            status = itemView.findViewById(R.id.rstatus);
            reg = itemView.findViewById(R.id.rreg);
            comment = itemView.findViewById(R.id.rcomment);

        }
    }}
//   name = itemView.findViewById(R.id.name);
// phoneno=itemView.findViewById(R.id.phoneno);
//emailid=itemView.findViewById(R.id.email);
//college = itemView.findViewById(R.id.college);
//sorce=itemView.findViewById(R.id.source);
//course=itemView.findViewById(R.id.course);
//college = itemView.findViewById(R.id.college);

//status=itemView.findViewById(R.id.status);
// reg=itemView.findViewById(R.id.regdate);
//comment=itemView.findViewById(R.id.comment);






