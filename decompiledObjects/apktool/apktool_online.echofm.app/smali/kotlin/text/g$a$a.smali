.class public final Lkotlin/text/g$a$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/g$a;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lkotlin/text/g$a;


# direct methods
.method public constructor <init>(Lkotlin/text/g$a;)V
    .locals 0

    iput-object p1, p0, Lkotlin/text/g$a$a;->o:Lkotlin/text/g$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Lkotlin/text/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/text/g$a$a;->o:Lkotlin/text/g$a;

    invoke-virtual {v0, p1}, Lkotlin/text/g$a;->get(I)Lkotlin/text/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lkotlin/text/g$a$a;->a(I)Lkotlin/text/d;

    move-result-object p1

    return-object p1
.end method
