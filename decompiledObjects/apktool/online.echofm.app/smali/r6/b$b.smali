.class public final Lr6/b$b;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr6/b;-><init>(ILg6/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lr6/b;


# direct methods
.method public constructor <init>(Lr6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr6/b$b;->o:Lr6/b;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Lx6/a;Ljava/lang/Object;Ljava/lang/Object;)Lg6/l;
    .locals 1

    .line 1
    new-instance p2, Lr6/b$b$a;

    .line 2
    .line 3
    iget-object v0, p0, Lr6/b$b;->o:Lr6/b;

    .line 4
    .line 5
    invoke-direct {p2, p3, v0, p1}, Lr6/b$b$a;-><init>(Ljava/lang/Object;Lr6/b;Lx6/a;)V

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lr6/b$b;->a(Lx6/a;Ljava/lang/Object;Ljava/lang/Object;)Lg6/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
