.class public final synthetic Lj8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;


# instance fields
.field public final synthetic a:Lj8/s;


# direct methods
.method public synthetic constructor <init>(Lj8/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/r;->a:Lj8/s;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lj8/r;->a:Lj8/s;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, v0, Lj8/s;->d:J

    sub-long/2addr v1, v3

    iget-object v3, v0, Lj8/s;->p:Lk8/i;

    iget-object v3, v3, Lk8/i;->a:Lk8/b;

    new-instance v4, Lj8/q;

    invoke-direct {v4, v0, v1, v2, p1}, Lj8/q;-><init>(Lj8/s;JLjava/lang/String;)V

    invoke-virtual {v3, v4}, Lk8/b;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
