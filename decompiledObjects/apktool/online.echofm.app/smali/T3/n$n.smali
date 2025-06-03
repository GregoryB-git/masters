.class public LT3/n$n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "n"
.end annotation


# instance fields
.field public final a:LT3/p;

.field public final b:LT3/n$p;

.field public final c:LT3/g;

.field public final d:Ljava/lang/Long;


# direct methods
.method public constructor <init>(LT3/p;LT3/n$p;Ljava/lang/Long;LT3/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT3/n$n;->a:LT3/p;

    iput-object p2, p0, LT3/n$n;->b:LT3/n$p;

    iput-object p4, p0, LT3/n$n;->c:LT3/g;

    iput-object p3, p0, LT3/n$n;->d:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(LT3/p;LT3/n$p;Ljava/lang/Long;LT3/g;LT3/n$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, LT3/n$n;-><init>(LT3/p;LT3/n$p;Ljava/lang/Long;LT3/g;)V

    return-void
.end method

.method public static synthetic a(LT3/n$n;)LT3/n$p;
    .locals 0

    .line 1
    iget-object p0, p0, LT3/n$n;->b:LT3/n$p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(LT3/n$n;)LT3/p;
    .locals 0

    .line 1
    iget-object p0, p0, LT3/n$n;->a:LT3/p;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public c()LT3/g;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$n;->c:LT3/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LT3/n$p;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$n;->b:LT3/n$p;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$n;->d:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LT3/n$n;->b:LT3/n$p;

    .line 7
    .line 8
    invoke-virtual {v1}, LT3/n$p;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " (Tag: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LT3/n$n;->d:Ljava/lang/Long;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ")"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method
