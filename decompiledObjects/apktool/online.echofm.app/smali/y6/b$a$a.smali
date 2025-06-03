.class public final Ly6/b$a$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly6/b$a;->b(LV5/t;Lg6/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ly6/b;

.field public final synthetic p:Ly6/b$a;


# direct methods
.method public constructor <init>(Ly6/b;Ly6/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly6/b$a$a;->o:Ly6/b;

    .line 2
    .line 3
    iput-object p2, p0, Ly6/b$a$a;->p:Ly6/b$a;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ly6/b$a$a;->o:Ly6/b;

    .line 2
    .line 3
    iget-object v0, p0, Ly6/b$a$a;->p:Ly6/b$a;

    .line 4
    .line 5
    iget-object v0, v0, Ly6/b$a;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ly6/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ly6/b$a$a;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LV5/t;->a:LV5/t;

    .line 7
    .line 8
    return-object p1
.end method
