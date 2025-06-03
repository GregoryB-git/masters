.class public final synthetic Lj8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj8/s;

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lj8/s;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/q;->a:Lj8/s;

    iput-wide p2, p0, Lj8/q;->b:J

    iput-object p4, p0, Lj8/q;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lj8/q;->a:Lj8/s;

    iget-wide v1, p0, Lj8/q;->b:J

    iget-object v3, p0, Lj8/q;->c:Ljava/lang/String;

    iget-object v4, v0, Lj8/s;->p:Lk8/i;

    iget-object v4, v4, Lk8/i;->b:Lk8/b;

    new-instance v5, Lw5/l;

    invoke-direct {v5, v0, v1, v2, v3}, Lw5/l;-><init>(Lj8/s;JLjava/lang/String;)V

    invoke-virtual {v4, v5}, Lk8/b;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
