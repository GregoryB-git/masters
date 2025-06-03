.class public final Lb1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# instance fields
.field public final synthetic a:Lb1/k;

.field public final synthetic b:Ls1/c;


# direct methods
.method public constructor <init>(Lb1/k;Ls1/c;)V
    .locals 0

    iput-object p1, p0, Lb1/j;->a:Lb1/k;

    iput-object p2, p0, Lb1/j;->b:Ls1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 0

    sget-object p1, Lb1/k$a;->ON_START:Lb1/k$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lb1/j;->a:Lb1/k;

    invoke-virtual {p1, p0}, Lb1/k;->c(Lb1/n;)V

    iget-object p1, p0, Lb1/j;->b:Ls1/c;

    invoke-virtual {p1}, Ls1/c;->d()V

    :cond_0
    return-void
.end method
