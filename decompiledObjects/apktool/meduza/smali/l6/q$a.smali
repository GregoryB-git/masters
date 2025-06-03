.class public final Ll6/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll6/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lk6/a$b;",
        "ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ll6/n;

.field public b:Z

.field public c:[Lj6/d;

.field public d:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll6/q$a;->b:Z

    const/4 v0, 0x0

    iput v0, p0, Ll6/q$a;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ll6/s0;
    .locals 4

    iget-object v0, p0, Ll6/q$a;->a:Ll6/n;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "execute parameter required"

    invoke-static {v1, v0}, Lm6/j;->a(Ljava/lang/String;Z)V

    new-instance v0, Ll6/s0;

    iget-object v1, p0, Ll6/q$a;->c:[Lj6/d;

    iget-boolean v2, p0, Ll6/q$a;->b:Z

    iget v3, p0, Ll6/q$a;->d:I

    invoke-direct {v0, p0, v1, v2, v3}, Ll6/s0;-><init>(Ll6/q$a;[Lj6/d;ZI)V

    return-object v0
.end method
