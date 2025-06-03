.class public final synthetic Li9/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:Li9/m0;

.field public final synthetic b:[I

.field public final synthetic c:[Ljava/lang/String;

.field public final synthetic d:[Ljava/lang/String;

.field public final synthetic e:Ln9/c;

.field public final synthetic f:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Li9/m0;[I[Ljava/lang/String;[Ljava/lang/String;Ln9/c;Ljava/util/HashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/l0;->a:Li9/m0;

    iput-object p2, p0, Li9/l0;->b:[I

    iput-object p3, p0, Li9/l0;->c:[Ljava/lang/String;

    iput-object p4, p0, Li9/l0;->d:[Ljava/lang/String;

    iput-object p5, p0, Li9/l0;->e:Ln9/c;

    iput-object p6, p0, Li9/l0;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Li9/l0;->a:Li9/m0;

    iget-object v1, p0, Li9/l0;->b:[I

    iget-object v2, p0, Li9/l0;->c:[Ljava/lang/String;

    iget-object v3, p0, Li9/l0;->d:[Ljava/lang/String;

    iget-object v4, p0, Li9/l0;->e:Ln9/c;

    iget-object v5, p0, Li9/l0;->f:Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x1

    invoke-interface {p1, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    const/4 v7, 0x0

    aput v6, v1, v7

    const/4 v1, 0x2

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v7

    const/4 v1, 0x3

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v7

    invoke-virtual {v0, v4, v5, p1}, Li9/m0;->h(Ln9/c;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method
