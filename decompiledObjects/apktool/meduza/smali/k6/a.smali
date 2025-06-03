.class public final Lk6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/a$a;,
        Lk6/a$g;,
        Lk6/a$f;,
        Lk6/a$b;,
        Lk6/a$c;,
        Lk6/a$d;,
        Lk6/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lk6/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lk6/a$a;

.field public final b:Lk6/a$g;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lk6/a$f;",
            ">(",
            "Ljava/lang/String;",
            "Lk6/a$a<",
            "TC;TO;>;",
            "Lk6/a$g<",
            "TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/a;->c:Ljava/lang/String;

    iput-object p2, p0, Lk6/a;->a:Lk6/a$a;

    iput-object p3, p0, Lk6/a;->b:Lk6/a$g;

    return-void
.end method
