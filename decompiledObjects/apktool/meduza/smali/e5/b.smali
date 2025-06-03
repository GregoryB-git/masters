.class public final Le5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/k;


# static fields
.field public static final d:Lc4/s;


# instance fields
.field public final a:Lc4/h;

.field public final b:Lv3/i0;

.field public final c:Lv5/c0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc4/s;

    invoke-direct {v0}, Lc4/s;-><init>()V

    sput-object v0, Le5/b;->d:Lc4/s;

    return-void
.end method

.method public constructor <init>(Lc4/h;Lv3/i0;Lv5/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/b;->a:Lc4/h;

    iput-object p2, p0, Le5/b;->b:Lv3/i0;

    iput-object p3, p0, Le5/b;->c:Lv5/c0;

    return-void
.end method
