.class public Lk3/b$a;
.super Lk3/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/b;->a(Lk3/b$b;Lr3/a;Ljava/lang/Class;)Lk3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lk3/b$b;


# direct methods
.method public constructor <init>(Lr3/a;Ljava/lang/Class;Lk3/b$b;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lk3/b$a;->c:Lk3/b$b;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lk3/b;-><init>(Lr3/a;Ljava/lang/Class;Lk3/b$a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public d(Lk3/q;Lc3/y;)Lc3/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/b$a;->c:Lk3/b$b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lk3/b$b;->a(Lk3/q;Lc3/y;)Lc3/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
