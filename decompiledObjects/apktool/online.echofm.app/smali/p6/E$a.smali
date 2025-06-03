.class public final Lp6/E$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/E;->a(LX5/g;LX5/g;Z)LX5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final o:Lp6/E$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp6/E$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lp6/E$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp6/E$a;->o:Lp6/E$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/l;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a(LX5/g;LX5/g$b;)LX5/g;
    .locals 0

    .line 1
    invoke-interface {p1, p2}, LX5/g;->k(LX5/g;)LX5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LX5/g;

    .line 2
    .line 3
    check-cast p2, LX5/g$b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lp6/E$a;->a(LX5/g;LX5/g$b;)LX5/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
