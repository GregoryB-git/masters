.class public final Lt6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX5/d;


# static fields
.field public static final o:Lt6/g;

.field public static final p:LX5/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt6/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lt6/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt6/g;->o:Lt6/g;

    .line 7
    .line 8
    sget-object v0, LX5/h;->o:LX5/h;

    .line 9
    .line 10
    sput-object v0, Lt6/g;->p:LX5/g;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()LX5/g;
    .locals 1

    .line 1
    sget-object v0, Lt6/g;->p:LX5/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method
