.class public Landroidx/appcompat/view/menu/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Ll/L;

.field public final b:Landroidx/appcompat/view/menu/d;

.field public final c:I


# direct methods
.method public constructor <init>(Ll/L;Landroidx/appcompat/view/menu/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/view/menu/b$d;->a:Ll/L;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/appcompat/view/menu/b$d;->b:Landroidx/appcompat/view/menu/d;

    .line 7
    .line 8
    iput p3, p0, Landroidx/appcompat/view/menu/b$d;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/b$d;->a:Ll/L;

    invoke-virtual {v0}, Ll/I;->d()Landroid/widget/ListView;

    move-result-object v0

    return-object v0
.end method
