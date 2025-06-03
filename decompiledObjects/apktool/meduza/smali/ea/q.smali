.class public final Lea/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lea/q$a;
    }
.end annotation


# static fields
.field public static final c:Lea/q$a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/q$a;

    invoke-direct {v0}, Lea/q$a;-><init>()V

    sput-object v0, Lea/q;->c:Lea/q$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/q;->a:Ljava/lang/String;

    iput-object p2, p0, Lea/q;->b:Ljava/lang/String;

    return-void
.end method
