.class public final Ly6/b$b;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly6/b;-><init>(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ly6/b;


# direct methods
.method public constructor <init>(Ly6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly6/b$b;->o:Ly6/b;

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
    .locals 0

    .line 1
    new-instance p1, Ly6/b$b$a;

    .line 2
    .line 3
    iget-object p3, p0, Ly6/b$b;->o:Ly6/b;

    .line 4
    .line 5
    invoke-direct {p1, p3, p2}, Ly6/b$b$a;-><init>(Ly6/b;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    invoke-virtual {p0, p1, p2, p3}, Ly6/b$b;->a(Lx6/a;Ljava/lang/Object;Ljava/lang/Object;)Lg6/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
