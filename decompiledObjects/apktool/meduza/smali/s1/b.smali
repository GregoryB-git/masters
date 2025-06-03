.class public final synthetic Ls1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# instance fields
.field public final synthetic a:Ls1/c;


# direct methods
.method public synthetic constructor <init>(Ls1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/b;->a:Ls1/c;

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 1

    iget-object p1, p0, Ls1/b;->a:Ls1/c;

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb1/k$a;->ON_START:Lb1/k$a;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lb1/k$a;->ON_STOP:Lb1/k$a;

    if-ne p2, v0, :cond_1

    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p1, Ls1/c;->f:Z

    :cond_1
    return-void
.end method
